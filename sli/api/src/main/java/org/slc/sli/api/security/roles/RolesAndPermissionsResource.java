package org.slc.sli.api.security.roles;

import javax.ws.rs.*;

import org.slc.sli.api.security.enums.Rights;
import org.slc.sli.api.service.EntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import org.slc.sli.api.config.EntityDefinition;
import org.slc.sli.api.config.EntityDefinitionStore;
import org.slc.sli.api.representation.EntityBody;

import java.util.*;


/**
 *  A RESTful class to return the roles and their configured rights.
 *
 *  This is meant to be a read-only operation, but contains a convenience post method
 *  to create new roles.
 *
 *  @see Rights
 */
@Path("/admin")
@Component
@Scope("request")
@Produces("application/json")

public class RolesAndPermissionsResource {

    @Autowired
    private EntityDefinitionStore store;

    private static final Logger LOG = LoggerFactory.getLogger(RolesAndPermissionsResource.class);

    /**
     * Creates a new map of a user with permissions to use as a default
     * 
     * @return a new hashmap of the user and their permissions.
     */
    private Map<String, Object> createRolesAndPermissions() {
        Map<String, Object> role = new HashMap<String, Object>();
        List<String> permissions = new ArrayList<String>();
        permissions.add(Rights.READ_GENERAL.getRight());
        permissions.add(Rights.WRITE_GENERAL.getRight());
        role.put("name", "Role1");
        role.put("rights", permissions);
        return role;
    }

    /**
     * Fetches the first 100 roles listed in the system to be serialized to json
     * This is intended to be a restful API call.
     * 
     * @return an object that is technically a list of maps that are the roles
     */
    @GET
    @Path("roles")
    public Object getRolesAndPermissions() {
        Map<String, Object> roles = new TreeMap<String, Object>();
        List<Map<String, Object>> roleList = new ArrayList<Map<String, Object>>();
        EntityDefinition def = store.lookupByResourceName("roles");
        EntityService service = def.getService();

        //Add some data here.
        service.create(new EntityBody(createRolesAndPermissions()));

        Iterable<String> names = service.list(0, 100);
        Iterable<EntityBody> entities = service.get(names);
        for(EntityBody body : entities) {
            roles.put("name", body.get("name"));
            roles.put("rights", body.get("rights"));
            roleList.add(roles);
        }
        return roleList;
    }

    /**
     * A simple method to add a new role to the database.
     * @param name the name of the new role (eg: Educator)
     * @param rights some list of rights to be added
     * @see Rights
     */
    @POST
    @Path("roles")
    public void createRoleWithPermission(String name, Object rights) {
        Map<String, Object> role = new TreeMap<String, Object>();
        role.put("name", name);
        role.put("rights", rights);
        EntityBody body = new EntityBody(role);
        EntityDefinition def = store.lookupByResourceName("roles");
        EntityService service = def.getService();
        service.create(body);
    }
}
