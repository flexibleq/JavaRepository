import com.fxq03.MyService;

module code.myTwo {
    requires code.myOne;
    requires rt;
    uses MyService;
}