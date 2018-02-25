import groovy.json.JsonSlurper;

def myJson = /ab-results-README.md-filtered.json/
def sFile = new File(myJson)

def myReadme = /README.md/
def counter = 0

def list = new JsonSlurper().parseText(sFile.text)
for (rec in list) {
        println counter++ + ". " + rec.status + ": " + rec.link + " ->|-> " + rec.redirect
}