========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "MFS.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.





1AVOVK8	RSRCK	3BDTCQN0	104739
1AVO8E7	RSRCK	3BDTDJFJ	111839
1AVPD45	RSRCK	3BDTC7R8	111839
1AVO7A2	RSRCK	3BDTDFTC	109494
1AVO523	RSRCK	3BDTCV39	PS112377
1AVORX8	RSRCK	3BDTB8QD	111651
1AVOT99	RSRCK	3BDTCVTQ	PS227154
1AVO524	RSRCK	3BDTCV8T	PS227154
1AVO8J6	RSRCK	3BDTCYG7	PS227154
1AVO8E4	RSRCK	3BDTDJFH	111182
1AVOT98	RSRCK	3BDTCVTL	PS06510
1AVOVK9	RSRCK	3BDTCQNZ	PS06510
1AVO699	RSRCK	3BDTDFTD	PS06510
1AVO7A1	RSRCK	3BDTDFTF	PS06510
1AVOVL7	RSRCK	3BDTCBBN	102518
1AVO2T4	RSRCK	3BDTCZJ3	ANTONIOM
1AVO8J5	RSRCK	3BDTCYG6	ANTONIOM
1AVPIK6	RSRCK	3BDTDHP9	108188
1AVPFG7	RSRCK	3BDTDD7D	108188
1AVO5B4	RSRCK	3BDTC50R	108188
1AVPBL7	RSRCK	3BDTC8KG	PS470411
1AVM176	RSRCK	3BDTB6H1	111819
1AVPFG7	RSRCK	3BDTDD7D	111819
1AVPD44	RSRCK	3BDTC7K9	111819
1AVO2T5	RSRCK	3BDTCZJ5	108179
1AVPFG7	RSRCK	3BDTDD7D	PS003946
