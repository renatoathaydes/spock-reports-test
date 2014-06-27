import spock.lang.Specification

/**
 *
 */
class MySpec extends Specification {

    def summer = new Summer()

    def "Summer class can sum anything"() {
        "an integer 2"
        given:
        int i = 2

        "Summer add something to 2"
        when:
        def result = summer.sum( i, something )

        "I get the 2 plus something back"
        then:
        result == something + i

        where:
        something << [ 1, 2, 3 ]

    }

}
