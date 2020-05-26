# twitter-structured-streaming

Software Requirements
* Install IntelliJ IDEA Community Edition 2019.3.5 or higher version
* Install Scala plugin
* Java 8 JDK - brew cask install adoptopenjdk/openjdk/adoptopenjdk8
* Scala 2.11.12 - (install from IntelliJ IDEA)
* Spark  2.4.3 - (automatically downloaded by SBT)

Once IntelliJ is installed
* From the Welcome screen, select Import project
* Navigate to the directory contains the build.sbt, and select build.sbt
* IntelliJ will import the project
* Open up TwitterSourceExample.scala to double check the dependencies are imported properly
* Select "TwitterSourceExample" and the right mouse click and select Run 'TwitterSourceExample' menu item
* If everything works perfectly then you should see the following

<code>
TwitterSourceExample
org.structured_streaming_sources.twitter.TwitterStreamingSource
Usage: &lt;consumer key&gt;, &lt;consumer secret&gt; &lt;access token&gt; &lt;access token secret&gt;
</code> 

##### This requires a Twitter developer account. You can create one at this <a href="https://developer.twitter.com/en/apply-for-access">link</a>.