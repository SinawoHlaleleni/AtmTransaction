package ATMtrans.controller.atmInforController;

import ATMtrans.domain.atmInfor.Atm;
import ATMtrans.factory.factoryAtmInfor.AtmFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

//import java.net.http.HttpHeaders;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class AtmControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Atm";

    @Test
    public void testGetAtms() {
       /* HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String>respense = restTemplate.exchange(baseURL + "all",
                HttpMethod.GET,entity,String.class);
        assertNotNull(respense.getBody());*/
    }

    @Test
    public void testGetAtmById(){
        Atm atm = restTemplate.getForObject( baseURL + "/atm/1",
                Atm.class);
        System.out.println(atm.getId());
        assertNotNull( atm );
    }

    @Test
    public void testCreateAtm(){
        Atm atm = AtmFactory.getType( "Capitec" );
        ResponseEntity<Atm>postResponse = restTemplate.postForEntity( baseURL +"/create",atm,Atm.class );
        assertNotNull( postResponse );
        assertNotNull( postResponse.getBody() );
    }

    @Test
    public void testUpdateAtm(){
        int id = 1;
        Atm atm = restTemplate.getForObject( baseURL + "/atm/" + id, Atm.class );
        restTemplate.put( baseURL + "/AnotherBankName" + id, atm );
        Atm updatedAtm = restTemplate.getForObject( baseURL + "/Atm/" + id, Atm.class );
        assertNotNull( updatedAtm );
    }


    @Test
    public void testDeleteAnotherBankName(){
        int id = 2;
        Atm atm = restTemplate.getForObject( baseURL + "/standAtm/" + id, Atm.class );
        assertNotNull( atm );
        restTemplate.delete( baseURL + "/atms/" + id );
        try{
            atm = restTemplate.getForObject( baseURL + "/anotherBankName/"+ id, Atm.class);
        }catch (final HttpClientErrorException e){
            assertEquals( e.getStatusCode(), HttpStatus.NOT_FOUND );
        }

    }
}