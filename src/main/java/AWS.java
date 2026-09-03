/*

IAM Policy Structure :
{
  "Version": "2012-10-17",
  "Id": "Optional",
  "Statement": [
    {
      "Sid": "Optional",
      "Effect": "Allow or Deny",
      "Principal": "Optional",
      "Action": "Action or NotAction",
      "Resource": "Resource or NotResource",
      "Condition": "Optional"
    }
  ]
}

# AWS-CLI - 3 options - AWS Management Console, AWS CLI, AWS SDK

# IAM Roles in AWS :

->Some AWS Services will perform action on our behalf , and to do so, we will assign permission to aws service with IAM Roles.
->IAM Role is kind of like a user, but they are not intended to be used by physical
people, but instead, they will be used by AWS Services.
->Common Roles - EC2 Instance Roles, Lamda Function Roles, Roles for CloudFormation.
->For any service for example EC2 - we have IAM Role with permission attahced to it which will try to access some service
in AWS . If the permission attached to that IAM role is correct , then it will be able to call the required service from AWS.








*/





































