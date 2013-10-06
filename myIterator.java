import java.lang.*;

public interface myIterator<E>{
	boolean hasNext();
	E next();
	void remove();
}