/**
*
*/
package org.slc.sli.api.resources.v1.aggregation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.jersey.api.uri.UriBuilderImpl;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slc.sli.api.config.EntityDefinition;
import org.slc.sli.api.config.EntityDefinitionStore;
import org.slc.sli.api.service.EntityService;
import org.slc.sli.api.test.WebContextTestExecutionListener;
import org.slc.sli.domain.CalculatedData;
import org.slc.sli.domain.CalculatedDatum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

/**
* @author nbrown
*
*/

public class AggregateListingResourceTest {

    private CalculatedDataListingResource<String> cVResource;

    @Before
    public void setup() throws URISyntaxException {
        Map<String, Map<String, Map<String, Map<String, String>>>> aggregateMap = new HashMap<String, Map<String, Map<String, Map<String, String>>>>();
        Map<String, Map<String, Map<String, String>>> assessments = new HashMap<String, Map<String, Map<String, String>>>();
        Map<String, Map<String, String>> act = new HashMap<String, Map<String, String>>();
        Map<String, String> highestEver = new HashMap<String, String>();
        Map<String, Map<String, Map<String, String>>> attendance = new HashMap<String, Map<String, Map<String, String>>>();
        Map<String, Map<String, String>> mathClass = new HashMap<String, Map<String, String>>();
        Map<String, String> lastSemester = new HashMap<String, String>();
        highestEver.put("ScaleScore", "28.0");
        act.put("HighestEver", highestEver);
        assessments.put("ACT", act);
        aggregateMap.put("assessments", assessments);
        lastSemester.put("PercentInClass", "90%");
        mathClass.put("LastSemester", lastSemester);
        attendance.put("MathClass", mathClass);
        aggregateMap.put("attendance", attendance);
        CalculatedData<String> cvData = new CalculatedData<String>(aggregateMap);
        cVResource = new CalculatedDataListingResource<String>(cvData);
    }

    /**
     * Test method for
     * {@link org.slc.sli.api.resources.v1.aggregation.CalculatedDataListingResource#getAvailableAggregates()}
     * .
     */
    @Test
    public void testGetAvailableCalculatedValues() {
        CalculatedDatum<String> actScore = new CalculatedDatum<String>("assessments", "HighestEver", "ACT",
                "ScaleScore", "28.0");
        CalculatedDatum<String> mathScore = new CalculatedDatum<String>("attendance", "LastSemester", "MathClass",
                "PercentInClass", "90%");
        @SuppressWarnings("unchecked")
        List<CalculatedDatum<String>> expected = Arrays.asList(actScore, mathScore);
        assertEquals(expected, cVResource.getCalculatedValues(null, null, null, null)
                .getEntity());
    }

    @Test
    public void testGetAvailableAggregates() {

    }

}
