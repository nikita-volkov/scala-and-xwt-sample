package scalaAndXwt.util

import scala.reflect.ClassTag

import org.eclipse.core.databinding.observable.Diffs
import org.eclipse.core.databinding.observable.value.AbstractObservableValue

class WritableValue[ T : ClassTag ]( private var v : T = null )
  extends AbstractObservableValue {

  override def doSetValue( a : Any ) {
    if ( v != a ) {
      fireValueChange( Diffs.createValueDiff( v, v = a.asInstanceOf[ T ] ) )
    }
  }
  def doGetValue = v.asInstanceOf[ Object ]
  def getValueType = reflect.classTag[ T ].runtimeClass
  
  def value_=( a : T ) { setValue( a ) }
  def value = v
}
