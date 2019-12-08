import com.fxq03.Impl.Czxy;
import com.fxq03.Impl.Itheima;
import com.fxq03.MyService;

module code.myOne {
    exports com.fxq01;
    exports com.fxq03;
    provides MyService with Czxy;
}