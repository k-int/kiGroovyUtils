package com.k_int.groovy.utils

public class RecursiveMapDiff {

  static diff(a, b ) {
    def result = []
    rdiff(a,b,result)
    result
  }

  static rdiff(a, b, changeSet ) {
    def result = []
    def a_keys = a.keySet().sort()
    def b_keys = a.keySet().sort()

    def a_iterator = a_keys.iterator();
    def b_iterator = a_keys.iterator();

    def a_key = a_iterator.hasNext() ? a_iterator.next() : null
    def b_key = b_iterator.hasNext() ? b_iterator.next() : null

    while ( a_key != null || a_key != null ) {
      if ( a_key != null &&
           b_key != null &&
           a_key == b_key) {
        // The keys match - see if the values do - If so, no change, if not, change
      }
      else if ( ( b_key != null ) && ( ( a_key == null ) || ( a_key.compareTo(b_key) > 0 ) ) ) {
        // b_key was added in b
      }
      else {
        // a_key was removed in b
      }

    }
  }
}
