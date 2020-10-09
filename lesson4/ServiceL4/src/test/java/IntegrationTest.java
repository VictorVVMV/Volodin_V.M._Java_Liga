import com.Lesson4Service.ServiceL4.controllers.OrderController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@WebMvcTest(OrderController.class)
public class IntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void runAllTest()throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/user");
        MvcResult result = mvc.perform(request).andReturn();
        assertNotNull(result.getResponse());
    }
}
