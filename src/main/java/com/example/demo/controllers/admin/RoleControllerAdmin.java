package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.controllers.utils.UriUtils;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;

@Controller
@RequestMapping(value = {UriUtils.URI_SLASH + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + UriUtils.URI_SLASH + RoleControllerAdmin.ROLE_CONTROLLER_ADMIN_NAME})
public class RoleControllerAdmin extends BaseAdminLinkedController<Role> {

    public static final String ROLE_CONTROLLER_ADMIN_NAME = "role";

    protected RoleControllerAdmin() {
        super(ROLE_CONTROLLER_ADMIN_NAME, Role.class);
    }

	@Override
	public Boolean checkEquality(Role item, Long externalId, String linkedItem) {
		// TODO Auto-generated method stub
		return null;
	}

}
