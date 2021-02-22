package ch.hearc.ig.guideresto.service;

import ch.hearc.ig.guideresto.business.BasicEvaluation;
import ch.hearc.ig.guideresto.business.City;
import ch.hearc.ig.guideresto.business.CompleteEvaluation;
import ch.hearc.ig.guideresto.business.EvaluationCriteria;
import ch.hearc.ig.guideresto.business.Restaurant;
import ch.hearc.ig.guideresto.business.RestaurantOverview;
import ch.hearc.ig.guideresto.business.RestaurantType;
import java.util.Collections;
import java.util.Set;

public class RestaurantService {

  public Set<RestaurantOverview> researchAllRestaurants() {
    return Collections.emptySet();
  }

  public Restaurant researchRestaurantById(int restaurantId) {
    return null;
  }

  public Set<Restaurant> researchRestaurantsByName(String research) {
    return Collections.emptySet();
  }

  public Set<Restaurant> researchRestaurantsByCityName(String research) {
    return Collections.emptySet();
  }

  public Set<Restaurant> researchRestaurantsByType(RestaurantType restaurantType) {
    return Collections.emptySet();
  }

  public Set<RestaurantType> researchAllRestaurantTypes() {
    return Collections.emptySet();
  }

  public Set<City> researchAllCities() {
    return Collections.emptySet();
  }

  public void insertRestaurant(Restaurant restaurant) {
  }

  public void insertCity(City city) {
  }

  public void insertBasicEvaluation(BasicEvaluation eval) {
  }

  public Set<EvaluationCriteria> researchAllEvaluationCriteria() {
    return Collections.emptySet();
  }

  public void insertCompleteEvaluation(CompleteEvaluation eval) {
  }

  public void updateRestaurant(Restaurant restaurant) {
  }

  public void deleteRestaurant(Restaurant restaurant) {
  }
}
