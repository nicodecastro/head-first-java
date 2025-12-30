JC = javac
JVM = java

JFLAGS = -d ./$(DIRECTORY)

DIRECTORY ?= Chapter_6
MAIN ?= ArrayListMagnet

SOURCES = $(wildcard $(DIRECTORY)/*.java)
CLASSES = $(SOURCES:.java=.class)

default: $(CLASSES)
	@echo "Running main class $(MAIN)..."
	$(JVM) -cp $(DIRECTORY) $(MAIN)
	@echo

%.class: %.java
	$(JC) $(JFLAGS) $(SOURCES)

run:


clean:
	rm -f ./$(DIRECTORY)/*.class
