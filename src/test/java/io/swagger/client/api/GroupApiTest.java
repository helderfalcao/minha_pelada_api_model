package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Group;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupApi
 */
public class GroupApiTest {

    private GroupApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GroupApi.class);
    }

    /**
     * Add a new group
     *
     * 
     */
    @Test
    public void addGroupTest() {
        Group body = null;
        // Void response = api.addGroup(body);

        // TODO: test validations
    }
    /**
     * Deletes a group
     *
     * 
     */
    @Test
    public void deleteGroupTest() {
        Long groupId = null;
        // Void response = api.deleteGroup(groupId);

        // TODO: test validations
    }
    /**
     * Find groups by public informations
     *
     * Multiple atributes of the group can be used on this operation. Can be used\\ \\ status, name, available space.
     */
    @Test
    public void findGroupTest() {
        String status = null;
        String name = null;
        String vacancy = null;
        // List<Group> response = api.findGroup(status, name, vacancy);

        // TODO: test validations
    }
    /**
     * Find Groups of the current user
     *
     * Retunr the groups of the authenticated user
     */
    @Test
    public void findUserGroupsTest() {
        List<String> userGroup = null;
        // List<Group> response = api.findUserGroups(userGroup);

        // TODO: test validations
    }
    /**
     * Find group by ID
     *
     * Returns a single group
     */
    @Test
    public void getGroupByIdTest() {
        String groupId = null;
        // Group response = api.getGroupById(groupId);

        // TODO: test validations
    }
    /**
     * Update an existing group
     *
     * 
     */
    @Test
    public void updateGroupTest() {
        Group body = null;
        // Void response = api.updateGroup(body);

        // TODO: test validations
    }
}
