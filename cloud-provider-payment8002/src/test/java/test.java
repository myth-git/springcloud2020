import java.time.ZonedDateTime;

public class test {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2022-04-05T12:59:06.276+08:00[Asia/Shanghai]
    }
}
