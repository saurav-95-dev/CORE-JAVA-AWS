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

# EBS Volumme :
-> EBS Volume are bound in a specific AZ.
-> EBS snapshots features - SS Archive, Recycle Bin, Fast SS Restore (FSR)

# EBS Snapshots :
-> We can create EBS volume accross different regions.
-> Multi-attach feature - only available for io1/io2 family.
-> Can allow upto 16 instance at a time.
-> Must use file system that is cluster aware.

# EFS - Elatic File System :
-> Use content management,  web serving, data sharing, Word-Press.
-> Only Compatible with LINUX Based AMI.

#LOAD BALANCER (servers) - ELB - Elastic Load balancer.
- REASON TO USE ELB:
-> Load Balancer has health check machanism through which it can determine which instance it has to send traffic to.
-> It can provide SSL termination (HTTPS) for your websites.
-> It can also separate public traffic from private traffic.

- TYPES OF MANAGES LOAD BALANCER ON AWS:
1)Classic Load balancer.
2)Application load balancer.
3)Network load balancer.
4)Gateway load balancer.


*/





































