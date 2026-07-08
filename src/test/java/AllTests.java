import ru.yandex.courier.CourierCreateTest;
import ru.yandex.courier.CouriereDeleteTest;
import ru.yandex.courier.CredentialsTest;
import ru.yandex.order.CreateOrderParamTest;
import ru.yandex.order.GetOrderListTest;
import ru.yandex.order.GetOrderTest;
import ru.yandex.order.GetOrderTrackParamTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CourierCreateTest.class,
        CouriereDeleteTest.class,
        CredentialsTest.class,
        CreateOrderParamTest.class,
        GetOrderListTest.class,
        GetOrderTest.class,
        GetOrderTrackParamTest.class
})

public class AllTests {
}
