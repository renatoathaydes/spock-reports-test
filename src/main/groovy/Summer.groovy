/**
 *
 */
class Summer {

    def sum( a, Object... others ) {
        ( [ a ] + others.list() ).sum()
    }

}
