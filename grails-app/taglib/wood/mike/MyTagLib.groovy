package wood.mike

class MyTagLib {

    static namespace = 'mw'

    def loadFlags = { attrs ->
        log.info('Loading flags')
        out << g.set(var: 'myFlags', value: '123')
    }
}