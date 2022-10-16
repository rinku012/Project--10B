package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.CollegeDTO;
import com.rays.dto.CourseDTO;


/**
 * Course serivce Interface.
 * @author Rinku
 *
 */
public interface CourseServiceInt extends BaseServiceInt<CourseDTO> {

	public CourseDTO findByName(String name, UserContext context);
}
