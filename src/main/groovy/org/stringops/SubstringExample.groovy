import java.util.regex.Pattern

class SubstringExample {

    static void main(String... args) {
        def s = "origin/feature/SCORE-28322_B_TicketDescrption"
        def s1 = "-" + s.minus("origin/feature/").toLowerCase().find('[a-z]{1,5}-\\d{1,5}')
        println 'device-id-targeting-s3-test-us-east-1' + s1
        def compile = Pattern.compile("[a-zA-Z][-a-zA-Z0-9]*")

        println compile.matcher('device-id-targeting-s3-test-us-east-1' + s1).matches()
    }
}