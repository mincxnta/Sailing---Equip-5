package cat.institutmarianao.sailing.ws.repository;
/*JPA*/

import java.util.Date;
import java.util.List;

import cat.institutmarianao.sailing.ws.model.BookedPlace;
import cat.institutmarianao.sailing.ws.model.BookedPlaceCompositeId;

public interface BookedPlaceRepository extends ViewRepository<BookedPlace, BookedPlaceCompositeId> {
	//List<BookedPlace> findByTripTypeIdAndDate(Long id, Date date);
}
