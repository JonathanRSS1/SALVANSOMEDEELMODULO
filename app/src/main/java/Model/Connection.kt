package Model

import java.sql.DriverManager
import java.sql.Connection

class Connection {

    fun StringConection(): Connection?
    {
        try {
            val ip = "jdbc:oracle:thin:@192.168.0.7:1521:xe"
            val user = "system"
            val password = "Q5v5xvt6"

            val strConnection = DriverManager.getConnection(ip,user,password)
            return  strConnection
        }
        catch (e:Exception)
        {
            println("Error: $e")
            return null
        }
    }
}