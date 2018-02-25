import groovy.json.JsonSlurper;

def myJson = /ab-results-README.md-filtered.json/
def sFile = new File(myJson)

def myReadme = /..\README.md/
def counter = 0

def list = new JsonSlurper().parseText(sFile.text)
for (rec in list) {
    if (rec.status == 301) {
        println "\n" + counter++ 
        println "From: " + rec.link
        println "To:   " + rec.redirect

        def rFile = new File(myReadme)
        def txt = rFile.text
        txt = txt.replaceAll(rec.link, rec.redirect)
        rFile.write(txt)
        sleep(1000)
        println "done."

    }
}