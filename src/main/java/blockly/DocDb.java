package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DocDb {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Doc_DB
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.login = :login"),Var.valueOf("login",Var.VAR_NULL));
   }
 }.call();
}

}

