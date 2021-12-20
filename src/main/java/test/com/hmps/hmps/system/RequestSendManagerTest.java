package test.com.hmps.hmps.system;

import com.hmps.hmps.dtos.PatientDTO;
import com.hmps.hmps.hardcodedtypes.*;
import com.hmps.hmps.system.RequestSendManager;

import java.io.IOException;
import java.util.Date;

public class RequestSendManagerTest {

    //@Test
    public void sendTest() throws IOException {

        PatientDTO dto = new PatientDTO();
        dto.setId(1000);
        dto.setCode("5644468");
        dto.setFirstName("Jane");
        dto.setLastName("Wanton");
        dto.setSurName("Surge");
        dto.setContact(null);
        dto.setPersonImageID(12345);
        dto.setHisCode("IOLSR23242342");
        dto.setBirthDate(new Date());
        dto.setGender(Gender.FEMALE);
        dto.setBloodGroup(BloodGroup.O_POSITIVE);
        dto.setMaritalStatus(MaritalStatus.SEPARATED);
        dto.setCountry(Country.UNITED_KINGDOM);
        dto.setNationality(10);
        dto.setLanguage(Language.ENGLISH);

        RequestSendManager.getInstance().send(dto);

    }

}
