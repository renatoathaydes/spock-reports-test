/**
 *
 */
class Summer {

    def sum( a, Object... others ) {
        ( [ a ] + others.toList() ).sum()
    }

}
