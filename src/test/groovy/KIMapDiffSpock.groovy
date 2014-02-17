import com.k_int.groovy.utils.*
import spock.lang.*

class KIMapDiffSpock extends spock.lang.Specification {

    def "Map Diff Works"() {
        expect:
        RecursiveMapDiff.diff(a,b).equals(result)

        where:
        a       | b               | result
        [:]     | [:]             | []
        [:]     | [a:1]           | [[op:'mapAdd',on:'root',key:'a',value:1]]
    }
}  
