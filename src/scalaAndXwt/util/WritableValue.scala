package scalaAndXwt.util

import org.eclipse.core.databinding.observable.value.IObservableValue
import org.eclipse.core.databinding.observable.Realm
import org.eclipse.core.databinding.observable.value.AbstractObservableValue
import org.eclipse.core.databinding.observable.Diffs
import scala.reflect._

class WritableValue[ T : ClassTag ]( private var v : T = null )
  extends AbstractObservableValue( {
    println(Realm.getDefault)
    Realm.getDefault
  } ) {
  //  def doSetValue( a : T ) {
  //    if ( v map ( _ == a ) getOrElse false ) {
  //      val oldValue = v.orNull
  //      v = Some(a)
  //      fireValueChange( Diffs.createValueDiff( oldValue, a ) )
  //    }
  //  }
  def value_=( a : T ) {
    setValue( a )
  }
  def value = v

  override def doSetValue( a : Any ) {
    if ( v != a ) {
      fireValueChange( Diffs.createValueDiff( v, v = a.asInstanceOf[ T ] ) )
    }
  }
  def doGetValue = v.asInstanceOf[ Object ]
  def getValueType = reflect.classTag[ T ].runtimeClass
}

//class WritableValue[ T <: Object : ClassTag ]( private var v : T = null ) extends IObservableValue {
//
//}