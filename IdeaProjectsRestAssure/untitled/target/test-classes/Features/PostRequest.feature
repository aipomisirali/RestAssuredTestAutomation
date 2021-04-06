Feature: PostRequest

  @Smoke
  Scenario: User sends Get Request
    Given URI for API
    When user sends a post Request
    Then User should get correct Response