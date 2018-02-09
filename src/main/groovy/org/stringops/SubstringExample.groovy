class SubstringExample {

    static void main(String... args) {
        def s = "origin/feature/DIT-28_B_TicketDescrption"
        println "-" + s.minus("origin/feature/").toLowerCase().split('_')[0]
    }
}