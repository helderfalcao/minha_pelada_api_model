package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GroupApi {
  /**
   * Add a new group
   * 
   * @param group Group to be registered to the platform (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("group")
  Call<Void> addGroup(
    @retrofit2.http.Body Group group
  );

  /**
   * Deletes a group
   * 
   * @param groupId Group id to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("group/{groupId}")
  Call<Void> deleteGroup(
    @retrofit2.http.Path("groupId") Long groupId
  );

  /**
   * Find groups by public informations
   * Multiple atributes of the group can be used on this operation. Can be used\\ \\ status, name, available space.
   * @return Call&lt;List&lt;Group&gt;&gt;
   */
  @GET("group")
  Call<List<Group>> findGroup();
    

  /**
   * Find Groups of the current user
   * Retunr the groups of the authenticated user
   * @param userGroup User Group values that need to be considered for filter (required)
   * @return Call&lt;List&lt;Group&gt;&gt;
   */
  @GET("group/findUserGroups")
  Call<List<Group>> findUserGroups(
    @retrofit2.http.Query("userGroup") List<String> userGroup
  );

  /**
   * Find group by ID
   * Returns a single group
   * @param groupId ID of group to return (required)
   * @return Call&lt;Group&gt;
   */
  @GET("group/{groupId}")
  Call<Group> getGroupById(
    @retrofit2.http.Path("groupId") String groupId
  );

  /**
   * Update an existing group
   * 
   * @param group Group object to be updated to the platform (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("group")
  Call<Void> updateGroup(
    @retrofit2.http.Body Group group
  );

}
