package cat.institutmarianao.sailing.ws.model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/* JPA annotations */
/* An employee is identified in the user table with role=EMPLOYEE */

/* Lombok */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Client extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int MIN_FULL_NAME = 3;
	public static final int MAX_FULL_NAME = 100;

	/* Validation */
	// @NotBlank(groups = OnUserCreate.class)
	/* JPA */
	protected String fullName;

	/* Validation */
	// @NotNull(groups = OnUserCreate.class)
	protected String phone;
}
