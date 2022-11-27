/**
 * 
 */
package com.sergiodeluca.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author sergio
 *
 */

@Service
@Profile("prod")
public class ProdEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		// TODO Auto-generated method stub
		return "prod";
	}

}
