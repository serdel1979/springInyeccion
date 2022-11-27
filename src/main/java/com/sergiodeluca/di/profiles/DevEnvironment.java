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
@Profile("dev")
public class DevEnvironment implements EnvironmentService{

	@Override
	public String getEnvironment() {
		// TODO Auto-generated method stub
		return "dev";
	}

}
