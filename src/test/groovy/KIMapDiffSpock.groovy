import com.k_int.groovy.utils.*
import spock.lang.*

class KIMapDiffSpock extends spock.lang.Specification {

    def "Map Diff Works"() {
        expect:
        RecursiveMapDiff.diff(a,b).equals(result)

        where:
        a           | b               | result
        [:]         | [:]             | []
        [:]         | [a:1]           | [[op:'mapAdd',on:'',key:'a',value:1]]
        [a:1]       | [a:1,b:2]       | [[op:'mapAdd',on:'',key:'b',value:2]]
        [a:1,c:3]   | [a:1,b:2,c:3]   | [[op:'mapAdd',on:'',key:'b',value:2]]
        [a:1,c:3]   | [a:1]           | [[op:'mapDel',on:'',key:'c']]
    }
}  
