FLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        Bozo.java \
        Dados.java \
        EntradaTeclado.java \
        Placar.java \
        Random.java  \
        RolaDados.java \


default: classes

classes: 
	$(CLASSES:.java=.class)

clean:
	$(RM) *.class