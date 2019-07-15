import com.arangodb.spark.ArangoSpark._
// import com.arangodb.spark.ArangoSpark.{ArangoSpark, WriteOptions}
import org.apache.spark.{SparkConf, SparkContext}

class HelloWorld (var firstName:String, var lastName:String, var _age:Int) {
}

object Blabli {

  def main(args: Array[String]): Unit = {
    println("Start!")

    val conf = new SparkConf()
      .setMaster("local[2]")
      .setAppName("Blabli")
      .set("arangodb.hosts", "127.0.0.1:8530, 127.0.0.1:8531, 127.0.0.1:8532")
      .set("arangodb.database", "someDatabase")
      .set("arangodb.user", "root")
      .set("arangodb.password", "")
      .set("arangodb.maxConnections", "720")
      .set("arangodb.acquireHostList", "true")
      .set("arangodb.loadBalancingStrategy", "ROUND_ROBIN")

    val sc = new SparkContext(conf);

    def carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

    val data = Array(carJson)
    val distData = sc.parallelize(data)

    for (a <- 1 to 1000000)  {
      println( "Value of a: " + a );
      save(distData, "myCollection");
      println("Written: " + a);
    }

    println("Stopped!");
  }
}
